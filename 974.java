HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0,1);
    int sum = 0;
    int count = 0;
    for(int i = 0; i < A.length; i++){
        sum +=  A[i];
        int r = (sum%K+K)%K;
        if(map.containsKey(r)){
            count += map.get(r);
        }
        map.put(r,map.getOrDefault(r,0)+1);
    }
    
    return count;