package com.jayfella.devkit.config;

import com.jme3.math.ColorRGBA;

public class CameraConfig {

    private ColorRGBA viewportColor = new ColorRGBA(0.01f, 0.01f, 0.01f, 1.0f);

    private float fieldOfView = 45.0f;
    private float frustumNear = 0.1f;
    private float frustumFar = 1000.0f;

    public CameraConfig() {

    }

    public ColorRGBA getViewportColor() { return viewportColor; }
    public void setViewportColor(ColorRGBA viewportColor) { this.viewportColor = viewportColor; }

    public float getFieldOfView() { return fieldOfView; }
    public void setFieldOfView(float fieldOfView) { this.fieldOfView = fieldOfView; }

    public float getFrustumNear() { return frustumNear; }
    public void setFrustumNear(float frustumNear) { this.frustumNear = frustumNear; }

    public float getFrustumFar() { return frustumFar; }
    public void setFrustumFar(float frustumFar) { this.frustumFar = frustumFar; }

}
