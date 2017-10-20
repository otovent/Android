package ws.wolfsoft.creative.API;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by root on 20/10/17.
 */

public interface Service {
    public void authToBackend(String endpoint, String username, String password, final Context callingClass, final ProgressDialog progressDialog);
}
