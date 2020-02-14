/// Review!!!

class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String, PriorityQueue<String>> hashmap = new HashMap<>();
        LinkedList<String> result = new LinkedList<>();
        for (List<String> ticket: tickets){
            if (!hashmap.containsKey(ticket.get(0))){
                PriorityQueue<String> temp = new PriorityQueue<>();
                hashmap.put(ticket.get(0), temp);
            }
            hashmap.get(ticket.get(0)).offer(ticket.get(1));
        }
        helper(result, hashmap, "JFK"); 
        return result;
    }
    
    public void helper(LinkedList<String> result, HashMap<String, PriorityQueue<String>> hashmap, String s){
        PriorityQueue<String> temp = hashmap.get(s);
        while(temp!=null && !temp.isEmpty()){
            helper(result, hashmap, temp.poll());
        }
        result.addFirst(s);
    }
}