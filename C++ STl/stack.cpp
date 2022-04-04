#include <iostream>
#include <stack>

using namespace std;

int main() {
  
  stack<string> s;

  s.push("Churchil");
  s.push("Yash");
  s.push("Rajpal");

  cout<<"Top Element -> "<<s.top()<<endl;
  
  s.pop();

  cout<<"Top Element -> "<<s.top()<<endl;

  cout<<"Size of stack is "<<s.size()<<endl;

  cout<<s.empty()<<endl;
}
