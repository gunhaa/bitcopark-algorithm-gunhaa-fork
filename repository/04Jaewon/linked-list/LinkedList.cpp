#include <iostream>

using namespace std;

struct Node {
    int data;
    Node* next;
};

class LinkedList {
private:
    Node* head;

public:
    LinkedList() : head(nullptr) {}

    void add(int value) {
        Node* new_node = new Node;
        new_node->data = value;
        new_node->next = head;
        head = new_node;
    }

    void traverse() {
        Node* current = head;
        while (current != nullptr) {
            cout << current->data << " -> ";
            current = current->next;
        }
        cout << "nullptr" << endl;
    }
};

int main() {
    LinkedList list;
    list.add(10);
    list.add(20);
    list.add(30);

    list.traverse();

    return 0;
}