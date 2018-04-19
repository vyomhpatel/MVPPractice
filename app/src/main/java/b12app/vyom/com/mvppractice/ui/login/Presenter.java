package b12app.vyom.com.mvppractice.ui.login;
import android.view.View;

public class Presenter implements IPresenter {

  //  Context context;
    IView iView;
    MainActivity activity;

    public Presenter(MainActivity activity) {
      this.activity = activity;
        iView = activity;
    }

    @Override
    public void onButtonClick(View view) {

     //   Button b = (Button) view;
    //    Toast.makeText(context,"clicked by "+b.getText(),Toast.LENGTH_SHORT).show();
        iView.showToast(view);


    }
}
