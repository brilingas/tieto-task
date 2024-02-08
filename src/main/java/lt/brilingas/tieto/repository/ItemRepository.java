package lt.brilingas.tieto.repository;

import lt.brilingas.tieto.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {
    @Query(nativeQuery = true,value = "SELECT * FROM items WHERE distance<=?1 AND season IN (season, 'all')")
    public List<Item> getAllByDistanceAndSeason(double distance, String season);
}
