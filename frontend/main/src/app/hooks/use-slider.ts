import { useCallback, useState } from "react";
import { sliderService } from "../service/slider_service";

export const useSlider = () => {
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState<string | null>(null);

    const newestSlider = useCallback(async () => {
        setLoading(true);
        setError(null);
        try {
            const result = await sliderService.newestSlider();
            return result;
        } catch (err) {
            setError(err instanceof Error ? err.message : 'An error occurred');
            return null;
        } finally {
            setLoading(false);
        }
    }, []);

    const operatingSystemSlider = useCallback(async () => {
        setLoading(true);
        setError(null);
        try {
            const result = await sliderService.operatingSystemSlider();
            return result;
        } catch (err) {
            setError(err instanceof Error ? err.message : 'An error occurred');
            return null;
        } finally {
            setLoading(false);
        }
    }, []);

    const languageSlider = useCallback(async () => {
        setLoading(true);
        setError(null);
        try {
            const result = await sliderService.languageSlider();
            return result;
        } catch (err) {
            setError(err instanceof Error ? err.message : 'An error occurred');
            return null;
        } finally {
            setLoading(false);
        }
    }, []);

    const jobSlider = useCallback(async () => {
        setLoading(true);
        setError(null);
        try {
            const result = await sliderService.jobSlider();
            return result;
        } catch (err) {
            setError(err instanceof Error ? err.message : 'An error occurred');
            return null;
        } finally {
            setLoading(false);
        }
    }, []);

    const aiSlider = useCallback(async () => {
        setLoading(true);
        setError(null);
        try {
            const result = await sliderService.aiSlider();
            return result;
        } catch (err) {
            setError(err instanceof Error ? err.message : 'An error occurred');
            return null;
        } finally {
            setLoading(false);
        }
    }, []);

    return {
        loading,
        error,
        newestSlider,
        operatingSystemSlider,
        languageSlider,
        jobSlider,
        aiSlider
    };
}