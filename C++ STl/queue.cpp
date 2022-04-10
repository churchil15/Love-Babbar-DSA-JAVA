#include <iostream>
#include <queue>

using namespace std;

int main() {
  
  queue<string> q;

  q.push("Churchil");
  q.push("Yash");
  q.push("Rajpal");

  cout<<"Size before pop is -> "<<q.size()<<endl;

  cout<<"First Element is -> "<<q.front()<<endl;
  q.pop();
  cout<<"First Element is -> "<<q.front()<<endl;

  cout<<"Size after pop is -> "<<q.size()<<endl;

  
}
