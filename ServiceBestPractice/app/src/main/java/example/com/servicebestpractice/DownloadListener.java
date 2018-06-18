package example.com.servicebestpractice;

/**
 * Created by jingluyuan on 6/6/18.
 */

public interface DownloadListener {
    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();
}
