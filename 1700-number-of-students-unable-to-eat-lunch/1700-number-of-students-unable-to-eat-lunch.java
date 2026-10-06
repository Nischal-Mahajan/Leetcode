class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer>st=new Stack<>();
        Queue<Integer>q=new LinkedList<>();
        for(int i=sandwiches.length-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        for(int i:students){
            q.add(i);
        }
        int count=0;
        while(!q.isEmpty() && !st.isEmpty()){
            if(q.peek()==st.peek()){
                q.remove();
                st.pop();
                count=0;
            }
            else{
                int temp=q.remove();
                q.add(temp);
                count++;
                if(count==q.size()) break;
            }
        }
        return q.size();
    }
}