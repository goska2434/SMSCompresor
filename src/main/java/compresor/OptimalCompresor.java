package compresor;

public class OptimalCompresor implements Compresor {

    private Smaz smaz = new Smaz();

    @Override
    public byte[] compress(String input) {
        return smaz.compress(input);
    }


    @Override
    public String uncompress(String input) {
        return smaz.decompress(input.getBytes());
    }

}