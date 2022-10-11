/ C++ program to demonstrate the
// working of queue
#include <bits/stdc++.h>
using namespace std;

// Driver Code
int main()
{
	// Declare a queue
	queue<int> q;

	// Insert elements in the queue
	q.push(10);
	q.push(5);
	q.push(15);
	q.push(1);

	// Delete elements from the queue
	q.pop();
	q.pop();

	cout << "Elements in Queue are: ";

	// Print the element stored
	// in queue
	while (!q.empty()) {
		cout << q.front() << ' ';

		// Pop the front element
		q.pop();
	}

	return 0;
}
