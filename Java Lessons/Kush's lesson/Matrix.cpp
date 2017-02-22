
/* Problem Statement
  For the matrix class, add a resize member function and a zero-paramter constructor.
*/

#include <vector>

using namespace std;

// MATRIX CLASS
template <typename Object>
class matrix {
  public:
    matrix (int rows, int cols) : array(rows)
    {
      for(auto & thisRow : array)
        thisRow.resize( cols );
    }
    
    //ZERO-PARAMETER CONSTRUCTOR 
    matrix() : array(0, vector<int>(0)){
      
    }
    //END ZERO-PARAMETER CONSTRUCTOR
    
    matrix( vector<vector<Object>> v ) : array{ v }
      { }
    matrix( vector<vector<Object>> && v ) : array{ std::move( v ) }
      { }
      
    const vector<Object> & operator[]( int row ) const
      { return array[ row ]; }
    vector<Object> & operator[]( int row )
      { return array[ row ]; }
      
    int numrows( ) const
      { return array.size( ); }
    int numcols( ) const
      {return numrows( ) ? array[ 0 ].size() : 0; }
    
    //RESIZE FUNCTION  
    void resize(unsigned row, unsigned col){
      array.resize(col, vector<Object>(row));
    }
    //END RESIZE FUNCTION
    
    
  private:
    vector<vector<Object>> array;
};

int main(void){
	matrix<int> testMatrix;
	
	testMatrix.resize(4,3);
	
	return 0;
}
