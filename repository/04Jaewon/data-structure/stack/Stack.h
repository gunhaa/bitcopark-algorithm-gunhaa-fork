#include <iostream>

using namespace std;

struct Node
{
    int data;
    Node* next;

    Node(const int& value) : data(value), next(nullptr) {}
};

class Stack
{
private:
    Node* top_node;
    int size;
    
public:
    Stack() : top_node(nullptr), size(0) {};

    ~Stack ()
    {
        while (!is_empty()) {
            pop();
        }
    };

    bool is_empty()
    {
        return top_node == nullptr;
    }

    void push(const int& value)
    {
        Node* new_node = new Node(value);
        new_node->next = top_node;
        top_node = new_node;
        size++;
    }

    int pop()
    {
        if (is_empty()) throw out_of_range("Stack is empty");

        Node* temp = top_node;
        int value = temp->data;

        top_node = top_node->next;
        delete temp;
        size--;

        return value;
    }

    int peek()
    {
        if (is_empty()) throw out_of_range("Stack is empty");
        return top_node->data;
    }

    void display()
    {
        Node* temp_node = top_node;
        while(temp_node != nullptr) {
            cout << temp_node->data << endl;
            temp_node = temp_node->next;
        }
    }

    int size_() {return size;}
};