LListInt(const LListInt& other) {
	head_ = NULL;
	tail_ = NULL;
	size_ = 0;
	int s = other.size();
	for (int i = 0; i < s; ++i) {
		this->insert(i, other.get(i));
	}
}

LListInt& operator=(const LListInt& other) {
	if (this == &other) {
		return *this;
	}
	else {
		this->clear();
		for (int i = 0; i < other.size(); ++i) {
			this->insert(i, other.get(i));
		}
		return *this;
	}
}


LListInt LListInt::operator+(const LListInt& other) const {
	LListInt sum(*this);
	for (int i = 0; i < other.size_; ++i) {
		sum.insert(sum.size_, other.get(i));
	}
	return sum;
}

ostream & operator << (ostream &outs, const LList &L)
{ 



	while (head_ != NULL)
	{
		if (head_ != tail_)
			outs << head_->data << ' ';
		head_ = head_->next;
		if (head_ == tail_)
			outs << head_->data;
	}
	return outs;

}


void push_back(const int& val)
{ 
	if (size == 0)
		this->insert(val);

	data = value;
	int next = NULL;
	tail_->next = n;
	tail_ = n;
	size++;
}