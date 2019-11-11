/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, Employee> res = new HashMap();
        for (Employee a : employees){
            res.put(a.id, a);
        }
        return helper(res, id);
    }
    
    private int helper(HashMap<Integer, Employee> res, int id){
        int importance = res.get(id).importance;
        for (int a : res.get(id).subordinates){
            importance += helper(res, a);
        }
        return importance;
    }
}