#include "Stack.h"

int main()
{
    Stack stack;

    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.push(50);

    cout << "pop >> " << stack.pop() << endl;
    cout << "pop >> " << stack.pop() << endl;
    cout << "pop >> " << stack.pop() << endl;

    stack.display();

    cout << "size: " << stack.size_() << endl;

    return 0;
}