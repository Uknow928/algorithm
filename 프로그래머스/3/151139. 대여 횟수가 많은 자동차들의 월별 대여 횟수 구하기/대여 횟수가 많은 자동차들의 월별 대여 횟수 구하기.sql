-- 코드를 입력하세요
SELECT month(start_date) as month, car_id, count(*) as records
from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
where car_id in 
        (select car_id
         from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
         where start_date >= '2022-08-01' and start_date < '2022-11-01'
         group by car_id
         having count(*) >= 5)
     and start_date >= '2022-08-01' and start_date < '2022-11-01'
group by car_id, month(start_date)
having count(*) != 0
order by month(start_date), car_id desc
