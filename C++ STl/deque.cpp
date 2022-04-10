#include <iostream>
#include <deque>
using namespace std;

int main() {
  
  deque<int> d;

  d.push_back(1);
  d.push_front(2);

  for(int i:d){
    cout<<i<<" ";
  }cout<<endl;

  // d.pop_front();

  cout<<"Print 0th Index Element-> "<<d.at(0)<<endl;
  cout<<"Print 1th Index Element-> "<<d.at(1)<<endl;

  cout<<"front-> "<<d.front()<<endl;
  cout<<"back-> "<<d.back()<<endl;

  cout<<d.empty()<<endl;

  cout<<"before erase size "<<d.size()<<endl;
  d.erase(d.begin(), d.begin()+1);
  cout<<"after erase size "<<d.size()<<endl;

  for(int i:d){
    cout<<i<<" ";
  }
}
