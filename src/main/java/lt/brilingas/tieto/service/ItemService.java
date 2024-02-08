package lt.brilingas.tieto.service;

import jakarta.validation.constraints.Min;
import lt.brilingas.tieto.entity.Item;
import lt.brilingas.tieto.repository.ItemRepository;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class ItemService {
    private ItemRepository itemRepository;
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    public List<Item> getItemsByDistanceAndSeason(@Min(1) double distance, String season) {
        return itemRepository.getAllByDistanceAndSeason(distance, season);
    }
}