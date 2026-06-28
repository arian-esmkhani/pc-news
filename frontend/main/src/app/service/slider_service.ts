import { DataDto } from "../types/data-type";

export const sliderService = {
    async newestSlider() {
        const response = await fetch(`/api/slider/newest`, {
            method: 'GET'
        });
        if (!response.ok) throw new Error('Failed to register');
        return response.json() as Promise<DataDto[]>;
    },

    async operatingSystemSlider() {
        const response = await fetch(`/api/slider/system`, {
            method: 'GET'
        });
        if (!response.ok) throw new Error('Failed to register');
        return response.json() as Promise<DataDto[]>;
    },

    async languageSlider() {
        const response = await fetch(`/api/slider/language`, {
            method: 'GET'
        });
        if (!response.ok) throw new Error('Failed to register');
        return response.json() as Promise<DataDto[]>;
    },

    async jobSlider() {
        const response = await fetch(`/api/slider/job`, {
            method: 'GET'
        });
        if (!response.ok) throw new Error('Failed to register');
        return response.json() as Promise<DataDto[]>;
    },

    async aiSlider() {
        const response = await fetch(`/api/slider/ai`, {
            method: 'GET'
        });
        if (!response.ok) throw new Error('Failed to register');
        return response.json() as Promise<DataDto[]>;
    },
}