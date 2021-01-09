
package pl.sda.model.lotto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Games {

    @SerializedName("Lotto")
    @Expose
    private Lotto lotto;
    @SerializedName("Mini")
    @Expose
    private Mini mini;

    public Lotto getLotto() {
        return lotto;
    }

    public void setLotto(Lotto lotto) {
        this.lotto = lotto;
    }

    public Mini getMini() {
        return mini;
    }

    public void setMini(Mini mini) {
        this.mini = mini;
    }

    @Override
    public String toString() {
        return "Games{" +
                "lotto=" + lotto +
                ", mini=" + mini +
                '}';
    }
}
