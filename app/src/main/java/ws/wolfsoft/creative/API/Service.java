package ws.wolfsoft.creative.API;

import android.app.ProgressDialog;
import android.content.Context;

import java.util.Map;

/**
 * Created by root on 20/10/17.
 */

public interface Service {
    void authToBackend(String endpoint, String username, String password, final Context callingClass, final ProgressDialog progressDialog);
    void addOrEditUser(String endpoint, Map<String,String> postBody, final Context callingClass,
                       final ProgressDialog progressDialog);
}
