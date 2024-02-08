package lt.brilingas.tieto.controller;

import lt.brilingas.tieto.entity.Item;
import lt.brilingas.tieto.entity.Season;
import lt.brilingas.tieto.service.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class MainController {
    private final ItemService itemService;

    public MainController(ItemService itemService) {
        this.itemService = itemService;
    }
    @GetMapping()
    @ResponseBody
    public ResponseEntity<List<Item>> getItems(@RequestParam("distance")double distance, @RequestParam("season") Season season) {
        System.out.println(distance);
        System.out.println(season);

        List<Item> listOfItems = itemService.getItemsByDistanceAndSeason(distance, season.name());

        return ResponseEntity.ok(listOfItems);
    }
}