#ifndef QUEUE_H
#define QUEUE_H

const int MAX_SIZE = 5;

class Queue
{
private:
    int arr[MAX_SIZE];
    int front;
    int rear;

public:
    Queue();
    ~Queue();

    bool is_empty();
    bool is_full();
    void enqueue(int value);
    int dequeue();
    int peek();
    void display();
};

#endif
