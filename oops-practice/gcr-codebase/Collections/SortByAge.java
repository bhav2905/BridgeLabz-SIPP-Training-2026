import javax.lang.model.element.Name;

public class SortByAge {
    public class SortByAge implements Comarator<StusentData>{
        @Override
        public int compare(StudentData s1,StusentData s2){
            return s1.Name.compareTo(s2, Name);
        }
    }
}