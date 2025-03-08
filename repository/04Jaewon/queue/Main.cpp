#include "Queue.h"
#include "Queue.cpp"

int main()
{
    Queue queue;
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    queue.enqueue(40);

    queue.dequeue();
    queue.dequeue();

    queue.display();

    return 0;
}