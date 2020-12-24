    public ArrayList<Integer> makerandom(int size){
        ArrayList<Integer> intlist=new ArrayList<>();
        ArrayList<Integer> intlist2=new ArrayList<>();
        for(int i=0; i<size; i++)intlist.add(i);
        for(int j=0; j<size; j++){
            int temp=intlist.get(new Random().nextInt(intlist.size()));
            intlist.remove((Integer) temp);
            intlist2.add(temp);
        }
        return intlist2;
    }