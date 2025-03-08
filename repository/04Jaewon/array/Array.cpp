#include <iostream>
#include <cstdlib>

using namespace std;

int main()
{
    int size = 3;

    int* arr = (int*)malloc(size * sizeof(int));

    *(arr) = 1;
    *(arr + 1) = 2;
    *(arr + 2) = 3;

    for (int i = 0; i < size; i++)
    {
        printf("%d ", *(arr + i));
    }

    return 0;
}