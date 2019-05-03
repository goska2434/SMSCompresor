import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

class Paginator {


    private int maxLength;


    public Paginator(int length) {
        this.maxLength = length;
    }


    String[] paginate(String input) {

        Iterable<String> chunks = Splitter.fixedLength(maxLength).split(input);

        return Lists.newArrayList(chunks).toArray(new String[0]);
    }



}