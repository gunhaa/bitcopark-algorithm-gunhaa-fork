#include <iostream>
#include "Queue.h"

using namespace std;

Queue::Queue() : arr(), front(-1), rear(-1) {};
Queue::~Queue() {};

bool Queue::is_empty()
{
    return front == rear;
}

bool Queue::is_full()
{
    return rear == MAX_SIZE - 1;
}

void Queue::enqueue(int value)
{
    if (is_full())
        throw out_of_range("Queue is full");
    arr[++rear] = value;
}

int Queue::dequeue()
{
    if (is_empty())
        throw out_of_range("Queue is empty");
    return arr[++front];
}

int Queue::peek()
{
    if (is_empty())
        throw out_of_range("Queue is empty");
    return arr[++front];
}

void Queue::display()
{
    if (is_empty())
        throw out_of_range("Queue is empty");
    cout << "Queue: ";
    int i = front;
    while (i != rear)
    {
        cout << arr[++i] << " ";
    }
}