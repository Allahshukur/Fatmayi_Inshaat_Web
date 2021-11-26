package build.tools.Fatmayi_inshaat_web.Controller;

import build.tools.Fatmayi_inshaat_web.Dto.Dto.ToolsDto;
import build.tools.Fatmayi_inshaat_web.Dto.RequestDto.ToolsRequestDto;
import build.tools.Fatmayi_inshaat_web.Dto.ResponseDto.ToolsResponseDto;
import build.tools.Fatmayi_inshaat_web.Entity.ToolsEntity;
import build.tools.Fatmayi_inshaat_web.Repository.ToolsRepository;
import build.tools.Fatmayi_inshaat_web.Service.ToolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("Rest/Tools")
public class ToolsController {

    private final ToolsRepository toolsRepository;
    private final ToolService toolService;

    public ToolsController(ToolsRepository toolsRepository, ToolService toolService) {
        this.toolsRepository = toolsRepository;
        this.toolService = toolService;
    }

    @GetMapping()
    public List<ToolsResponseDto> search(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String photo,
            @RequestParam(required = false) Integer number,
            @RequestParam(required = false)BigDecimal money
    ){
        List<ToolsDto> list = toolService.findAll();

        List<ToolsResponseDto> result = new ArrayList<>();

        for (ToolsDto toolsDto: list){
            result.add(ToolsResponseDto.toolsResponseDto(toolsDto));
        }

        return result;
    }

    @PostMapping()
    public String Add(@RequestBody ToolsRequestDto toolsRequestDto){
        toolService.save(toolsRequestDto.toDto());
        return toolsRequestDto.toString();
    }

    @PutMapping()
    public String Update(@RequestBody ToolsRequestDto toolsRequestDto){
        toolService.update(toolsRequestDto.toDto());
        return toolsRequestDto.toString();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ToolsResponseDto> deleteById(@PathVariable("id") Long id){
        if (toolService.findById(id)==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else
            return ResponseEntity.status(HttpStatus.OK).body(ToolsResponseDto.toolsResponseDto(toolService.deleteById(id)));
    }
}
