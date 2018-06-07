package org.reactnative.camera.utils;

public class ViewFinderLayout {
  private int mWidth;
  private int mHeight;
  private int mPaddingX;
  private int mPaddingY;

  public ViewFinderLayout(int width, int height, int paddingX, int paddingY) {
    mWidth = width;
    mHeight = height;
    mPaddingX = paddingX;
    mPaddingY = paddingY;
  }

  public int getWidth() {
    return mWidth;
  }

  public int getHeight() {
    return mHeight;
  }

  public int getPaddingX() {
    return mPaddingX;
  }

  public int getPaddingY() {
    return mPaddingY;
  }
}
