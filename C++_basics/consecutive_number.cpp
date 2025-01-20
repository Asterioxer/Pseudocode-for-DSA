/*#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    for(int i=n;i<=n+2;i++)
    {
        cout<<i<<" ";
    }
    return 0;
} */
#include<bits/stdc++.h>
using namespace std;
int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;
    bool fnd = false;
    for (int i = 1; i <= sqrt(n); ++i) {
        if (i * (i + 1) == n) {
            cout << n << " = " << i << " * " << (i + 1) << endl;
            fnd = true;
            break;
        }
    }

    if (!fnd) {
        cout << n << "cannot be expressed as a product of two consecutive numbers." << endl;
    }

    return 0;
}