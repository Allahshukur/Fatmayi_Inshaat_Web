package build.tools.Fatmayi_inshaat_web.Service;

import build.tools.Fatmayi_inshaat_web.Dto.Dto.CustomersDto;
import build.tools.Fatmayi_inshaat_web.Dto.RequestDto.CustomersRequestDto;
import build.tools.Fatmayi_inshaat_web.Entity.CustomerEntity;
import build.tools.Fatmayi_inshaat_web.Repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;


    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<CustomersDto> findAll(){
        List<CustomerEntity> list;

        list=customerRepository.findAll();

        List<CustomersDto> resultDto = new ArrayList<>();

        for (CustomerEntity customerEntity: list){
            resultDto.add(CustomersDto.toCustomersDto(customerEntity));
        }

        return resultDto;
    }

    public CustomersDto findById(Integer id){
        Optional<CustomerEntity> optional = customerRepository.findById(id);

        if (optional.isPresent()) {                  // icerisinde opyekt varsa dovre gir
            return CustomersDto.toCustomersDto(customerRepository.findById(id).get());
        }else
            return null;
    }

    public CustomersDto deleteById(Integer id){
        CustomersDto customersDto = findById(id);
        customerRepository.deleteById(id);
        return customersDto;
    }


    public void save(CustomersDto customersDto){
        customerRepository.save(customersDto.toEntity());
    }

    public void update(CustomersDto customersDto){
        if (customerRepository.getById(customersDto.getId())==null){
            throw new IllegalArgumentException("not found");
        } else
            customerRepository.save(customersDto.toEntity());
    }
}
