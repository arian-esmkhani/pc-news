import { AiCarousel } from "./components/ai-carousel";
import { CategorySection } from "./components/category-section";
import { HeroSection } from "./components/hero-section";
import { JobCarousel } from "./components/job-carousel";
import { LanguageCarousel } from "./components/language_carousel";
import { NewestCarousel } from "./components/newest-carousel";
import { SystemCarousel } from "./components/system-carousel";

export default function Home() {
  return (
    <div className="bg-linear-to-b from-indigo-300/80 to-indigo-950
      dark:bg-linear-to-b dark:from-indigo-950 dark:to-black">
      <HeroSection/>
      <CategorySection/>
      <NewestCarousel/>
      <span className="flex justify-center p-34 text-3xl text-shadow-md/50 text-black
        text-shadow-indigo-700 dark:text-shadow-pink-800">Every Day being better</span>

      <AiCarousel/>
      <SystemCarousel/>
      <LanguageCarousel/>
      <JobCarousel/>

      <div className="mt-22 h-7"></div>
    </div>
  )
}