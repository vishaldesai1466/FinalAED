# INFO 5100 Application Engineering and Devlopment Final Project

## Authors:
  - Ravindra Chabhadia (NUID: 002796610)
  - Vishal Desai (NUID: 002707668)
  
  # Topic: Laptop Donation
 # Problem Statememt
 This application is for an organization which collects unused laptops from various sources like individual person, Universities and Companis.
Distributes this laptop to the needy by setting up laptop Fairs at a particular time at different locations.
Extra laptop obtained from the sources is stored in the inventory of the organization.
If enough laptop is not available at one fair, nearby laptop fair are contacted, and if extra laptop is found at the requested fair, then laptop is transported to the respective fair.
laptop present in the inventory is also tested in the Service Center for quality purposes. If the laptop stored does not pass the quality check, then it is sent for Recycling.

##Structure and scope of project :
Our project has 4 Enterprises, 13 Organization and 12 roles




Eneterprise:

MainCenter("Main Center"),
InspectionCenter("Inspection Center"),
RecyclingCenter("Recycling Center"),
TransportAgency("Transport Agency");




Organization:



Admin
Donor
MainOffice
Inventory
ServiceCenter
Recycling
Transport
StoreChain
Store
Driver
Technician



Roles:



Admin("Admin"),
MainOfficeManager("Main Office Manager"),
InventoryManager("Inventory Manager"),
Donor("Donor"),
ServiceCenterManager("ServiceCenter Manager"),
Technician("Technician"),
RecycleManager("Recycle Manager"),
TransportManager("Transport Manager"),
StoreChainManager("StoreChainManager"),     
StoreManager("StoreManager"),
Driver("Driver");

