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

    void remove(int value)
    {
        root = remove(root, value);
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

    Node *remove(Node *node, int value)
    {
        if (node == nullptr)
            return node;

        if (value < node->data)
        {
            node->left = remove(node->left, value);
        }

        else if (value > node->data)
        {
            node->right = remove(node->right, value);
        }
        
        else
        {
            if (node->left == nullptr && node->right == nullptr)
            {
                delete node;
                return nullptr;
            }

            else if (node->left == nullptr)
            {
                Node *temp = node->right;
                delete node;
                return temp;
            }
            
            else if (node->right == nullptr)
            {
                Node *temp = node->left;
                delete node;
                return temp;
            }
            
            else
            {
                Node *min_node = find_min(node->right);
                node->data = min_node->data;
                node->right = remove(node->right, min_node->data);
            }
        }

        return node;
    }

    Node *find_min(Node *node)
    {
        while (node != nullptr && node->left != nullptr)
        {
            node = node->left;
        }
        return node;
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
    bst.insert(75);
    bst.insert(90);
    bst.insert(100);
    bst.insert(77);

    bst.remove(70);

    bst.inorder();

    return 0;
}