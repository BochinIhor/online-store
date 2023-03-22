export class User {
  isSelected!: boolean;
  username!: string;
  email!: string;
  phoneNumber!: string;
  password!: string;
  firstname!: string;
  lastname!: string;
  role!: string;
}

export const UserColumns = [
  {
    key: 'isSelected',
    type: 'isSelected',
    label: '',
  },
  {
    key: 'username',
    type: 'text',
    label: 'Username'
  },
  {
    key: 'password',
    type: 'text',
    label: 'Password',
  },
  {
    key: 'firstname',
    type: 'text',
    label: 'First name',
  },
  {
    key: 'lastname',
    type: 'text',
    label: 'Last name',
  },
  {
    key: 'email',
    type: 'text',
    label: 'Email',
  },
  {
    key: 'phoneNumber',
    type: 'text',
    label: 'Phone Number',
  },
  {
    key: 'role',
    type: 'text',
    label: 'User role',
  },
  {
    key: 'isEdit',
    type: 'isEdit',
    label: '',
  },
];
