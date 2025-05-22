class MicroBlog {
    public String truncate(String input) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        StringBuilder  sb = new StringBuilder();
        int i = 0;
        for (int codePoint : input.codePoints().toArray()) {
            String s = Character.toString(codePoint);
            sb.append(s);
            i++;
            if(i >= 5) break ;
        }
        String result = sb.toString();
        return result;

    }

}
