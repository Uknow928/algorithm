-- 코드를 입력하세요
SELECT book_id, author_name, date_format(published_date, "%Y-%m-%d") as published_date
from book inner join author on book.author_id = author.author_id
where category like '경제'
order by published_date