package learning;


public class MyOwnHashMap {

	private static final int MAXIMUM_SIZE= 16;
	private Entry list[]= new Entry[MAXIMUM_SIZE];
	
class Entry
{
final String key;
String value;
Entry next;

Entry(String k, String v)
{
key=k;
value=v;
}

public String getKey() {
	return key;
}



public String getValue() {
	return value;
}

public void setValue(String value) {
	this.value = value;
}

}


public Entry get(String k)
{
	int hash= Math.abs(k.hashCode()) %MAXIMUM_SIZE;
	
	Entry e= list[hash];
	while(e!=null)
	{
		if(e.key.equals(k)){
			return e;
		}
		e=e.next;
	}
	return null;
}



//to enter key value pair in list

public void put(String k, String v) {
			int hash = Math.abs(k.hashCode()) % MAXIMUM_SIZE;
			Entry e = list[hash];
//if e is not null it means its a old bucket (filled location index) 
			if (e != null) { 
				//if keys are same it means we are overwriting
				if (e.key.equals(k)) {
					e.value = v;
				} 
				else {
					//if keys are not same it means we are chaining and new node to an old bucket
					while (e.next != null) {
						e = e.next;
					}
					Entry entryInOldBucket = new Entry(k, v);
					e.next = entryInOldBucket;
				}

			}
			else{
				//if e is null it means its a new bucket (unfilled yet) 
				Entry entryInNewBucket = new Entry(k,v);
				list[hash]= entryInNewBucket;
			}

		}
		public static void main(String[] args) {
			
			MyOwnHashMap hm= new MyOwnHashMap();
			hm.put("dinesh","dhyani");
			hm.put("Niranjan", "SMTS");
			/*hm.put("Anurag","mudgal");
			hm.put("Mukesh","upreti");*/
			
			Entry e= hm.get("dinesh");
		System.out.println(e.getValue());
		}
		


}