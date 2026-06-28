package main.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import main.dto.DataDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaSliderRepo implements SliderRepo{

    private static final int STATIC_LIMIT = 10;
    private static final String OPERATING_SYSTEM = "OperatingSystem";
    private static final String PROGRAMMING_LANGUAGE = "ProgrammingLanguage";
    private static final String JOB_POSITIONS = "JobPositions";
    private static final String AI = "Ai";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<DataDto> newestSlider() {
        TypedQuery<DataDto> query = entityManager.createQuery("""
                SELECT NEW main.dto.DataDto(
                    t.id, t.title, t.imgUrl)
                FROM Topic t
                WHERE t.deletedAt IS NULL
                ORDER BY t.createdAt DESC
                """, DataDto.class);
        return query.setMaxResults(STATIC_LIMIT)
                .getResultList();
    }

    @Override
    public List<DataDto> operatingSystemSlider() {
        TypedQuery<DataDto> query = entityManager.createQuery("""
                SELECT NEW main.dto.DataDto(
                    t.id, t.title, t.imgUrl)
                FROM Topic t
                WHERE t.deletedAt IS NULL AND t.firstCategory = :system
                ORDER BY t.createdAt DESC
                """, DataDto.class);
        return query.setParameter("system", OPERATING_SYSTEM)
                .setMaxResults(STATIC_LIMIT)
                .getResultList();
    }

    @Override
    public List<DataDto> languageSlider() {
        TypedQuery<DataDto> query = entityManager.createQuery("""
                SELECT NEW main.dto.DataDto(
                    t.id, t.title, t.imgUrl)
                FROM Topic t
                WHERE t.deletedAt IS NULL AND t.firstCategory = :language
                ORDER BY t.createdAt DESC
                """, DataDto.class);
        return query.setParameter("language", PROGRAMMING_LANGUAGE)
                .setMaxResults(STATIC_LIMIT)
                .getResultList();
    }

    @Override
    public List<DataDto> jobSlider() {
        TypedQuery<DataDto> query = entityManager.createQuery("""
                SELECT NEW main.dto.DataDto(
                    t.id, t.title, t.imgUrl)
                FROM Topic t
                WHERE t.deletedAt IS NULL AND t.firstCategory = :job
                ORDER BY t.createdAt DESC
                """, DataDto.class);
        return query.setParameter("job", JOB_POSITIONS)
                .setMaxResults(STATIC_LIMIT)
                .getResultList();
    }

    @Override
    public List<DataDto> aiSlider() {
        TypedQuery<DataDto> query = entityManager.createQuery("""
                SELECT NEW main.dto.DataDto(
                    t.id, t.title, t.imgUrl)
                FROM Topic t
                WHERE t.deletedAt IS NULL AND t.firstCategory = :ai
                ORDER BY t.createdAt DESC
                """, DataDto.class);
        return query.setParameter("ai", AI)
                .setMaxResults(STATIC_LIMIT)
                .getResultList();
    }
}
