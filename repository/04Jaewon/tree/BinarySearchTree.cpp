#include <iostream>

using namespace std;

struct Node
{
    int data;
    Node *left;
    Node *right;

    Node(int value) : data(value), left(nullptr), right(nullptr) {}
};

class BinarySearchTree
{
private:
    Node *root;

public:
    BinarySearchTree() : root(nullptr) {};

    void insert(int value)
    {
        insert(root, value);
    }

    void inorder()
    {
        inorder(root);
    }

private:
    void insert(Node *&node, int value)
    {
        if (node == nullptr)
        {
            node = new Node(value);
        }
        else if (value < node->data)
        {
            insert(node->left, value);
        }
        else
        {
            insert(node->right, value);
        }
    }

    void inorder(Node *node)
    {
        if (node == nullptr)
            return;

        inorder(node->left);
        cout << node->data << " ";
        inorder(node->right);
    }
};

int main()
{
    BinarySearchTree bst;
    bst.insert(50);
    bst.insert(30);
    bst.insert(20);
    bst.insert(40);
    bst.insert(70);
    bst.insert(60);
    bst.insert(80);

    bst.inorder();

    return 0;
}