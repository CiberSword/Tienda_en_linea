package com.poo.practica6.supermercado.departamentos.electronica;

//import supermercado.departamentos.Productos;

public abstract class Celular extends Productos {
    private int modelo;
    private int camPixeles;
    private int memoriaRAM;
    private int memoriaROM;
    private float pantalla;
    public String color;
    private String procesador;
    private String SO;
    private boolean lectorHuella;
    private float bateria;

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setCodigoIdentificacion(String codigoIdentificacion) {
        this.codigoIdentificacion = codigoIdentificacion;
    }

    public String getCodigoIdentificacion() {
        return codigoIdentificacion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setPixeles(int camPixeles) {
        this.camPixeles = camPixeles;
    }

    public int getPixeles() {
        return this.camPixeles;
    }

    public void setRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getRam() {
        return memoriaRAM;
    }

    public void setROM(int memoriaROM) {
        this.memoriaROM = memoriaROM;
    }

    public int getROM() {
        return memoriaROM;
    }

    public void setPantalla(float pantalla) {
        this.pantalla = pantalla;
    }

    public float getPantalla() {
        return pantalla;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public String getSO() {
        return SO;
    }

    public void setLectorHuella(boolean lectorHuella) {
        this.lectorHuella = lectorHuella;
    }

    public boolean getLectorHuella() {
        return lectorHuella;
    }

    public void setBateria(float bateria) {
        this.bateria = bateria;
    }

    public float getBateria() {
        return bateria;
    }
}

class Samsung extends Celular {

    Samsung(String color) {
        setPrecio((float) 17289.00);
        setCodigoIdentificacion("SS20128");
        setMarca("SAMSUNG");
        setModelo("Galaxy S20");
        setPixeles(64);
        setRAM(8);
        setROM(128);
        setPantalla((float) 6.2);
        setColor("Azul");
        setProcesador("Exynos 990");
        setSO("Android 10");
        setLectorHuella(true);
        setBateria((float) 4000.00);
        /*
        this.camPrixeles = 64;
        this.memoriaRAM = 8;
        this.memoriaROM = 128;
        this.pantalla = 6.2;
        this.color = color;
        this.procesador = "Exynos 990";
        this.SO = "Android 10";
        this.lectorHuella = true;
        this.bateria = 4000.00;
        */
    }
}

class iPhone extends Celular {
    private boolean reconocimientoFacial;
    private boolean resistenciaAgua;

    iPhone(String color) {
        setPrecio((float) 17289.00);
        setCodigoIdentificacion("SS20128");
        setMarca("APPLE");
        setModelo("iPhone 12");
        setPixeles(64);
        setRAM(4);
        setROM(128);
        setPantalla((float) 6.1);
        setColor("Gris");
        setProcesador("Apple A14 Bionic");
        setSO("iOS 14");
        setLectorHuella(true);
        setBateria((float) 2775.00);
        this.reconocimientoFacial = true;
        this.resistenciaAgua = true;
        /*
        this.camPrixeles = 64;
        this.memoriaRAM = 4;
        this.memoriaROM = 128;
        this.pantalla = 6.1;
        this.color = color;
        this.procesador = "Apple A14 Bionic";
        this.SO = "iOS 14";
        this.lectorHuella = true;
        this.reconocimientoFacial = true;
        this.resistenciaAgua = true;
        this.bateria = 2775.00;
        */
    }

    public boolean reconocimientoFacial() {
        return reconocimientoFacial;
    }

    public boolean resistenciaAgua() {
        return resistenciaAgua;
    }
}

class Huawei extends Celular {
    private boolean resistenciaAgua;

    Huawei(String color) {

        setPrecio((float) 7899.00);
        setCodigoIdentificacion("SS20128");
        setMarca("HUAWEI");
        setModelo("P40");
        setPixeles(50);
        setRAM(8);
        setROM(128);
        setPantalla((float) 6.1);
        setColor("Rosa");
        setProcesador("Huawei Kirin 990");
        setSO("EMUI 10.1 (Basado en Android 10)");
        setLectorHuella(true);
        setBateria((float) 3800.00);
        this.resistenciaAgua = true;
        /*
        setMarca("HUAWEI");
        setModelo("P40");
        setPrecio(7899.00);
        setCodigoIdentificacion("HP40128");
        this.camPrixeles = 50;
        this.memoriaRAM = 8;
        this.memoriaROM = 128;
        this.pantalla = 6.1;
        this.color = color;
        this.procesador = "Huawei Kirin 990";
        this.SO = "EMUI 10.1 (Basado en Android 10)";
        this.lectorHuella = true;
        this.resistenciaAgua = true;
        this.bateria = 3800.00;
        */
    }

    public boolean geResistenciaAgua() {
        return resistenciaAgua;
    }
}

class pruebaCelulares {
    public static void main(String[] args) {
        Celular celular = new Samsung("Azul");
    }
}
