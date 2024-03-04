package com.Shivansh.FingerGolf;

public class OBBData
{
public static final String AppType = "";

public static class XAPKFile {
public final boolean mIsMain;
public final String mFileVersion;
public final long mFileSize;
XAPKFile(boolean isMain, String fileVersion, long fileSize) {
mIsMain = isMain;
mFileVersion = fileVersion;
mFileSize = fileSize;
}
}

public static final XAPKFile[] xAPKS = {
new XAPKFile(
true, // true signifies a main file
"4", // the version of the APK that the file was uploaded against
41467341L // the length of the file in bytes
)
};
};

