package task1_3.model;

public class PyramidModel {
    private int levels;

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public String buidPyramid(){
        int loclLevels=levels;
        StringBuilder result = new StringBuilder();
            for (int i = 1; i <= loclLevels; i++) {
                String prefix = new String(new char[loclLevels - i]).replace("\0", " ");
                String sufix = "";
                for (int k = 1; k < i; k++) {
                    prefix += k;
                    sufix = k + sufix;
                }
            result.append(prefix + i + sufix+"\n");
            }

            return result.toString();

    }
}
