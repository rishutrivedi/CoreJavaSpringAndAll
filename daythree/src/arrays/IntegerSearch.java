package arrays;

public class IntegerSearch extends AbstractSearch{

	@Override
	public boolean search(ObjList[] obj_list, ObjList obj) {
		for(int i=0;i<obj_list.length;i++) {
			if(obj_list[i].getNumber() == obj.getNumber()) {
				return true;
			}
		}
		return false;
	}

}
