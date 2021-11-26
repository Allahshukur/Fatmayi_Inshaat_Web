package build.tools.Fatmayi_inshaat_web.Controller;

import build.tools.Fatmayi_inshaat_web.Dto.Dto.CustomersDto;
import build.tools.Fatmayi_inshaat_web.Dto.RequestDto.CustomersRequestDto;
import build.tools.Fatmayi_inshaat_web.Dto.ResponseDto.CustomersResponseDto;
import build.tools.Fatmayi_inshaat_web.Entity.CustomerEntity;
import build.tools.Fatmayi_inshaat_web.Repository.CustomerRepository;
import build.tools.Fatmayi_inshaat_web.Service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "Rest/Customers")
public class CustomerController {

    private final CustomerRepository customerRepository;
    private final CustomerService customerService;


    public CustomerController(CustomerRepository customerRepository, CustomerService customerService) {
        this.customerRepository = customerRepository;
        this.customerService = customerService;
    }

    @GetMapping()
    public List<CustomersResponseDto> search(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String phone,
            @RequestParam(required = false) String address,
            @RequestParam(required = false) String other
    ){
        List<CustomersDto> list = customerService.findAll();

        List<CustomersResponseDto> result = new ArrayList<>();

        for (CustomersDto customersDto: list){
            result.add(CustomersResponseDto.toDto(customersDto));
        }

        return result;
    }

    @PostMapping()
    public String Add(@RequestBody CustomersRequestDto customersRequestDto){
        customerService.save(customersRequestDto.toDto());
        return customersRequestDto.toString();
    }

//    @PostMapping("{id}")
//    public ResponseEntity<CustomersRequestDto> Sale(@PathVariable("id") Integer id){
//        if (customerService.findById(id)==null){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//        customerService.save(customersRequestDto.toDto());
//        return customersRequestDto.toString();
//    }

    @PutMapping()
    public String Update(@RequestBody CustomersRequestDto customersRequestDto){
        customerService.update(customersRequestDto.toDto());
        return customersRequestDto.toString();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CustomersResponseDto> deleteById(@PathVariable("id") Integer id){
        if (customerService.findById(id)==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        else {
            return ResponseEntity.status(HttpStatus.OK).body(CustomersResponseDto.toDto(customerService.deleteById(id)));
        }
    }

}
