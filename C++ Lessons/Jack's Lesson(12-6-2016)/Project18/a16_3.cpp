#include <iostream>
#include <algorithm>

using namespace std;


void sortBySmallest(int list[], int start, int size);
int findSmallestIndex(const int list[], int start, int size);


int main() {

	int s[10] = { 4, 23, 654, 23, 25, 63, 3, 212, 663, 43 };
	for (int i = 0; i< 10; i++) {
		cout << s[i] << " ";
	}
	sortBySmallest(s, 0, 10);
	cout << endl;
	for (int i = 0; i< 10; i++) {
		cout << s[i] << " ";
	}
}






// returns the smallest index, from list[start] to end of list
int findSmallestIndex(int list[], int start, int size) {
	int smallest = list[start];
	int smallestIndex = start;
	for (int i = start; i < size; i++) {
		if (smallest > list[i]) {
			smallest = list[i];
			smallestIndex = i;
		}
	}
	return smallestIndex;
}





// recursive sort (ascending)
void sortBySmallest(int list[], int start, int size) {
	if (start < size) {
		int smallIndex = findSmallestIndex(list, start, size); //smallest index from start to end
		int temp = list[start];                                //holder for list[start]
		list[start] = list[smallIndex];                        //list[start] gets smallest value
		list[smallIndex] = temp;                               //smallest gets value from holder
		sortBySmallest(list, start + 1, size);                   //start incremented
	}
}


/* Output
4 23 654 23 25 63 3 212 663 43
3 4 23 23 25 43 63 212 654 663
*/