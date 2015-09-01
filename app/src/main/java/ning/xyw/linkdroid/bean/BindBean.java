package ning.xyw.linkdroid.bean;

/**
 * Created by ning on 15-9-1.
 */
public class BindBean {
    private String sourceDir;
    private String targetDir;
    private boolean binded;

    public String getSourceDir() {
        return sourceDir;
    }

    public void setSourceDir(String sourceDir) {
        this.sourceDir = sourceDir;
    }

    public String getTargetDir() {
        return targetDir;
    }

    public void setTargetDir(String targetDir) {
        this.targetDir = targetDir;
    }

    public boolean isBinded() {
        return binded;
    }

    public void setBinded(boolean binded) {
        this.binded = binded;
    }
}
