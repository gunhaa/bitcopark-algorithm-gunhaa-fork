#include <iostream>

using namespace std;

template <typename T>
struct Node
{
    T data;
    Node *next;
    Node *prev;

    Node(T value) : data(value), next(nullptr), prev(nullptr) {}
};

template <typename T>
class LinkedList
{
private:
    Node<T> *head;
    Node<T> *tail;

public:
    LinkedList() : head(nullptr), tail(nullptr) {}

    ~LinkedList()
    {
        Node<T> *current = head;
        while (current != nullptr)
        {
            Node<T> *next = current->next;
            delete current;
            current = next;
        }
    }

    void push_back(T value)
    {
        Node<T> *new_node = new Node<T>(value);

        if (tail == nullptr)
        {
            head = new_node;
            tail = new_node;
        }

        else
        {
            tail->next = new_node;
            new_node->prev = tail;
            tail = new_node;
        }
    }

    void push_front(T value)
    {
        Node<T> *new_node = new Node<T>(value);

        if (head == nullptr)
        {
            head = new_node;
            tail = new_node;
        }

        else
        {
            new_node->next = head;
            head->prev = new_node;
            head = new_node;
        }
    }

    Node<T> *find_node(T value)
    {
        Node<T> *temp_node = head;

        while (temp_node != nullptr)
        {
            if (temp_node->data == value)
            {
                return temp_node;
            }
            temp_node = temp_node->next;
        }

        return nullptr;
    }

    void remove(T value)
    {
        Node<T> *node = find_node(value);

        if (node == nullptr)
            return;

        if (node == head)
        {
            head = head->next;
            if (head != nullptr)
                head->prev = nullptr;
            else
                tail = nullptr;
        }
        else if (node == tail)
        {
            tail = tail->prev;
            if (tail != nullptr)
                tail->next = nullptr;
            else
                head = nullptr;
        }
        else
        {
            node->prev->next = node->next;
            node->next->prev = node->prev;
        }

        delete node;
    }

    void display()
    {
        Node<T> *current = head;
        while (current != nullptr)
        {
            cout << current->data << " -> ";
            current = current->next;
        }
        cout << "nullptr" << endl;
    }
};

struct Point
{
    int x, y;

    bool operator==(const Point &other)
    {
        return x == other.x && y == other.y;
    }
};

ostream &operator<<(std::ostream &out, const Point &point)
{
    out << "( " << point.x << ", " << point.y << " )";

    return out;
}

int main()
{
    LinkedList<Point> list;
    Point p1{1, 2};
    Point p2{2, 3};
    Point p3{3, 4};
    list.push_back(p1);
    list.push_back(p2);
    list.push_front(p3);

    list.display();

    cout << list.find_node(p2)->data << endl;

    list.remove(p2);

    list.display();

    return 0;
}