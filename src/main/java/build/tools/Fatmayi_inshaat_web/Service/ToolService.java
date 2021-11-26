package build.tools.Fatmayi_inshaat_web.Service;

import build.tools.Fatmayi_inshaat_web.Dto.Dto.ToolsDto;
import build.tools.Fatmayi_inshaat_web.Dto.RequestDto.ToolsRequestDto;
import build.tools.Fatmayi_inshaat_web.Entity.ToolsEntity;
import build.tools.Fatmayi_inshaat_web.Repository.ToolsRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ToolService {

    private final ToolsRepository toolsRepository;

    public ToolService(ToolsRepository toolsRepository) {
        this.toolsRepository = toolsRepository;
    }

    public List<ToolsDto> findAll(){

        List<ToolsEntity> list;

        list = toolsRepository.findAll();

        List<ToolsDto> resultDto = new ArrayList<>();

        for (ToolsEntity toolsEntity: list) {
           ToolsDto toolsDto= ToolsDto.toToolsDto(toolsEntity);
           resultDto.add(toolsDto);
        }

        return resultDto;
    }

    public ToolsDto findById(Long id){
        Optional<ToolsEntity> optional = toolsRepository.findById(id);

        if (optional.isPresent()){                    // icerisinde opyekt varsa dovre gir
            return ToolsDto.toToolsDto(toolsRepository.findById(id).get());
        } else
            return null;
    }

    public void save(ToolsDto toolsDto){
        toolsRepository.save(toolsDto.toEntity());
    }

    public void update(ToolsDto toolsDto){
        if (toolsRepository.getById(toolsDto.getId())==null){
            throw new IllegalArgumentException("not found");
        } else
            toolsRepository.save(toolsDto.toEntity());
    }

    public ToolsDto deleteById(@PathVariable("id") Long id){
        ToolsDto toolsDto = findById(id);
        toolsRepository.deleteById(id);
        return toolsDto;
    }

}
