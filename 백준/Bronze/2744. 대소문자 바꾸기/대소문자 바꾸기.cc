#include <iostream>
#include <string>

using namespace std;

int main() {
    string input;
    cin >> input;

    for (int i = 0; i < input.length(); i++) {
        if (input[i] >= 'A' && input[i] <= 'Z') {
            input[i] += 'a' - 'A';
        } else {
            input[i] -= 'a' - 'A';
        }
    }

    cout << input;
}